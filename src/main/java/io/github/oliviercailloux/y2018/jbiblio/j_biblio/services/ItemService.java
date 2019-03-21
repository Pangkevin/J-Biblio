package io.github.oliviercailloux.y2018.jbiblio.j_biblio.services;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Item;

@RequestScoped
public class ItemService {
	@PersistenceContext
	private EntityManager em;

	@Inject
	private QueryHelper helper;

	@Transactional
	public List<Item> getAll() {

		return em.createQuery(helper.selectAll(Item.class)).getResultList();

	}

	@Transactional
	public void persist(Item item) {

		em.persist(item);

	}
}
