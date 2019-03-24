package io.github.oliviercailloux.y2018.jbiblio.j_biblio.services;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity.Person;

@RequestScoped
public class PersonService {

	@PersistenceContext
	private EntityManager em;

	@Inject
	private QueryHelper helper;

	@Transactional
	public List<Person> getAll() {

		return em.createQuery(helper.selectAll(Person.class)).getResultList();

	}

	@Transactional
	public void persist(Person person) {

		em.persist(person);

	}
}
