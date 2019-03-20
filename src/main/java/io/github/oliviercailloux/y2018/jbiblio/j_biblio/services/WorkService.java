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
@Path("workJPA")
public class WorkService {
	@SuppressWarnings("unused")
	private static final Logger LOGGER = Logger.getLogger(WorkService.class.getCanonicalName());

	@PersistenceContext
	private EntityManager em;
	
	@Inject
	private HttpServletRequest request;

	@GET
	@Transactional
	@Produces("text/plain")
	public Response getWorkServlet() {

		List<Work> works = em.createQuery("Select W from Work W", Work.class).getResultList();
		String allWorks = "";
		for (Work work : works) {
			allWorks += work.getIdWork()+"\n";
		}
		if (allWorks.equals(""))
			return Response.status(Response.Status.OK).build();
		else			
			return Response.ok().entity(allWorks).build();
	}
}


