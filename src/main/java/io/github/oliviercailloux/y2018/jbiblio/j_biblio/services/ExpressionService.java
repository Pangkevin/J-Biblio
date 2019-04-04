package io.github.oliviercailloux.y2018.jbiblio.j_biblio.services;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.expression.Expression;

@RequestScoped
public class ExpressionService {
	@PersistenceContext
	private EntityManager em;

	@Inject
	private QueryHelper helper;

	@Transactional
	public List<Expression> getAll() {

		return em.createQuery(helper.selectAll(Expression.class)).getResultList();

	}

	@Transactional
	public void persist(Expression expression) {

		em.persist(expression);

	}
}
