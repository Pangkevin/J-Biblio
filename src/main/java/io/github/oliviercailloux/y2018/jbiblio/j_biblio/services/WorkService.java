package io.github.oliviercailloux.y2018.jbiblio.j_biblio.services;

import java.util.List;
import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.work.Work;

@RequestScoped
public class WorkService {
	@PersistenceContext
	private EntityManager em;

	@Inject
	private QueryHelper helper;

	@Transactional
	public List<Work> getAll() {

		return em.createQuery(helper.selectAll(Work.class)).getResultList();

	}

	@Transactional
	public void persist(Work work) {

		em.persist(work);

	}
}
