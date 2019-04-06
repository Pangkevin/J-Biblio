package io.github.oliviercailloux.y2018.jbiblio.j_biblio.services;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.apache.commons.lang3.StringUtils;

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

	public List<Item> findByField(String itemIdentifier, String fingerprint) {
		final CriteriaBuilder cb = em.getCriteriaBuilder();
		final CriteriaQuery<Item> cq = cb.createQuery(Item.class);
		final Root<Item> e = cq.from(Item.class);
		if (!StringUtils.isBlank(itemIdentifier)) {
			cq.where(cb.like(e.get("itemIdentifier"), itemIdentifier));
		}
		if (!StringUtils.isBlank(fingerprint)) {
			cq.where(cb.like(e.get("fingerprint"), fingerprint));
		}

		return em.createQuery(cq).getResultList();

	}

}
