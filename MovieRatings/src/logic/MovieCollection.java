package logic;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MovieCollection {
	
	private List<Movie> movieList;

	public MovieCollection(List<Movie> movieList) {
		super();
		this.movieList = movieList;
	}

	public MovieCollection() {
		movieList = new ArrayList<>();
	}

	public List<Movie> getMovieList() {
		return movieList;
	}

	public void add(Movie m) {
		movieList.add(m);
	}
	
	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}
	
	public List<Movie> filterMovies(Predicate<Movie> condition){
		List<Movie> filteredList = new ArrayList<>();
		for (Movie m: movieList) {
			if (condition.test(m)) {
				filteredList.add(m);
			}
		}
		return filteredList;
	}
	
	public double getLowestRating() {
		double lowestRating = movieList	.stream()
										.map(m -> m.getRating())
										.reduce(Double.POSITIVE_INFINITY, Math::min);
		return lowestRating;
	}
	
	public double getHighestRating() {
		double highestRating = movieList.stream()
										.map(m -> m.getRating())
										//.reduce(0.0, (a,b) -> Math.max(a,b))
										.reduce(0.0, Math::max);
										
		return highestRating;
	}
	
	public double getAverageRating() {
		double meanRating = movieList.stream()
									.map(m -> m.getRating())
									.reduce(0.0, (a,b) -> a + b);
		return meanRating/movieList.size();
	}
	
	public int getSize() {
		return movieList.size();
	}

}
