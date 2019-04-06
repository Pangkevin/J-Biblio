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
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Manifestation;

@RequestScoped
public class ManifestationService {
	@PersistenceContext
	private EntityManager em;

	@Inject
	private QueryHelper helper;

	@Transactional
	public List<Manifestation> getAll() {

		return em.createQuery(helper.selectAll(Manifestation.class)).getResultList();

	}

	@Transactional
	public void persist(Manifestation manifestation) {

		em.persist(manifestation);

	}

	public List<Manifestation> findByField(String editionDesignation, String manifestationIdentifier) {
		final CriteriaBuilder cb = em.getCriteriaBuilder();
		final CriteriaQuery<Manifestation> cq = cb.createQuery(Manifestation.class);
		final Root<Manifestation> e = cq.from(Manifestation.class);
		if (!StringUtils.isBlank(editionDesignation)) {
			cq.where(cb.like(e.get("editionDesignation"), editionDesignation));
		}
		if (!StringUtils.isBlank(manifestationIdentifier)) {
			cq.where(cb.like(e.get("manifestationIdentifier"), manifestationIdentifier));
		}

		return em.createQuery(cq).getResultList();

	}
}
