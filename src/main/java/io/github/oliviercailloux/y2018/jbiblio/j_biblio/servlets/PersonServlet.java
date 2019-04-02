package io.github.oliviercailloux.y2018.jbiblio.j_biblio.servlets;

import java.io.IOException;
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

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.responsibleentity.Person;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.services.PersonService;

@RequestScoped
@Path("person")
public class PersonServlet {
	private static final Logger LOGGER = Logger.getLogger(WorkJsonServlet.class.getCanonicalName());

	@PersistenceContext
	private EntityManager em;

	@Inject
	private PersonService personService;

	@GET
	@Transactional
	@Produces("application/json")
	public List<Person> getWorksServlet() {

		List<Person> personList = personService.getAll();
		return personList;
	}

	@POST
	@Transactional
	@Consumes("application/json")
	public Response addWorkServlet(Person person) {
		em.persist(person);
		LOGGER.info("Person added!");
		return Response.status(Response.Status.OK).build();
	}

}
