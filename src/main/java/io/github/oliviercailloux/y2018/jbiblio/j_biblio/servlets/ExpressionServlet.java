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

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.expression.Expression;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.work.Work;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.services.ExpressionService;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.services.WorkService;

@RequestScoped
@Path("Expression")
public class ExpressionServlet {

	private static final Logger LOGGER = Logger.getLogger(ExpressionServlet.class.getCanonicalName());

	@PersistenceContext
	private EntityManager em;

	@Inject
	private ExpressionService expressionService;

	@GET
	@Transactional
	@Produces({ "application/json" })
	public List<Expression> getExpressionsServlet() {

		List<Expression> expressions = expressionService.getAll();
		return expressions;
	}

	@POST
	@Transactional
	@Consumes("application/json")
	public Response addExpressionServlet(Expression expression) {
		em.persist(expression);
		LOGGER.info("Expression added!");
		return Response.status(Response.Status.OK).build();
	}

}
