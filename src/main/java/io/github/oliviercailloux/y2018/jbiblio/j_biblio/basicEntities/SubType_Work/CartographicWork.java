package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicEntities.SubType_Work;

import java.awt.Point;
import java.util.Collection;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicEntities.Work;
/**
 * Type of work
 *
 */
public class CartographicWork extends Work {
	
	private Point coordinate;
	private int equinox; //year
	
	public CartographicWork(int idWork, Collection<String> titleOfWork, String formOfWork, Point coordinate, int equinox){
		super( idWork, titleOfWork,formOfWork);
		this.coordinate = coordinate;
		this.equinox = equinox;
	}
	
	public Point getCoordinate() {
		return coordinate;
	}
	public void setCoordinate(Point coordinate) {
		this.coordinate = coordinate;
	}
	public int getEquinox() {
		return equinox;
	}
	public void setEquinox(int equinox) {
		this.equinox = equinox;
	}
}
