package io.github.oliviercailloux.y2018.jbiblio.j_biblio.servlets;

import java.util.List;
import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.lang3.StringUtils;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.work.Work;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.services.WorkService;

@RequestScoped
@Path("work")
public class WorkJsonServlet {

	private static final Logger LOGGER = Logger.getLogger(WorkJsonServlet.class.getCanonicalName());

	@PersistenceContext
	private EntityManager em;

	@Inject
	private WorkService workService;

	@GET
	@Transactional
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces({ "application/json" })
	public List<Work> getWorksServlet(@QueryParam("formOfWork") String formOfWork,
			@QueryParam("contextForTheWork") String contextForTheWork) {

		final List<Work> worksList;
		/**
		 * Checks if both parameters are empty otherwise we select all work in the
		 * work's table
		 */
		if (!StringUtils.isBlank(formOfWork) || !StringUtils.isBlank(contextForTheWork)) {
			worksList = workService.findByField(formOfWork, contextForTheWork);
		} else {
			worksList = workService.getAll();
		}

		return worksList;
	}

	@POST
	@Transactional
	@Consumes("application/json")
	public Response addWorkServlet(Work work) {
		em.persist(work);
		LOGGER.info("Work added!");
		return Response.status(Response.Status.OK).build();
	}

}
