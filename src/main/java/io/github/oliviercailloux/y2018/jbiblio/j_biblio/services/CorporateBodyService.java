package io.github.oliviercailloux.y2018.jbiblio.j_biblio.services;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity.CorporateBody;

public class CorporateBodyService {
	@PersistenceContext
	private EntityManager em;

	@Inject
	private QueryHelper helper;

	@Transactional
	public List<CorporateBody> getAll() {

		return em.createQuery(helper.selectAll(CorporateBody.class)).getResultList();

	}

	@Transactional
	public void persist(CorporateBody corporateBody) {

		em.persist(corporateBody);

	}
}
