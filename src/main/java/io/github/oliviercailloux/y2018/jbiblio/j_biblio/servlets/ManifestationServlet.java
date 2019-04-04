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
import javax.ws.rs.core.Response;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Manifestation;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.work.Work;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.services.ManifestationService;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.services.WorkService;

@RequestScoped
@Path("Manifestation")
public class ManifestationServlet {

	private static final Logger LOGGER = Logger.getLogger(WorkJsonServlet.class.getCanonicalName());

	@PersistenceContext
	private EntityManager em;

	@Inject
	private ManifestationService manifestationService;

	@GET
	@Transactional
	@Produces({ "application/json" })
	public List<Manifestation> getManifestationsServlet() {

		List<Manifestation> manifestations = manifestationService.getAll();
		return manifestations;
	}

	@POST
	@Transactional
	@Consumes("application/json")
	public Response addManifestationServlet(Manifestation manifestation) {
		em.persist(manifestation);
		LOGGER.info("Manifestation added!");
		return Response.status(Response.Status.OK).build();
	}
}
