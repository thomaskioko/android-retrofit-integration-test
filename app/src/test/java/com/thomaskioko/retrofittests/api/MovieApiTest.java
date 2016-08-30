package com.thomaskioko.retrofittests.api;


import com.thomaskioko.retrofittests.api.model.Movie;
import com.thomaskioko.retrofittests.api.model.Reviews;
import com.thomaskioko.retrofittests.api.model.Videos;

import org.junit.Test;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

import static junit.framework.Assert.assertEquals;

/**
 * Class to test all endpoints.
 *
 * @author Thomas Kioko
 */
public class MovieApiTest extends BaseTestCase {

    @Test
    public void getTopRatedMovies() throws IOException {

        Call<Movie> topRatedList = getTmdbApiClient().movieInterface().getTopRatedMovies();
        Response<Movie> movieResponse = topRatedList.execute();

        assertEquals(movieResponse.code(), 200);
        assertEquals(true, movieResponse.isSuccessful());

    }

    @Test
    public void getPopularMovies() throws IOException {

        Call<Movie> popularMovies = getTmdbApiClient().movieInterface().getPopularMovies();
        Response<Movie> movieResponse = popularMovies.execute();

        assertEquals(movieResponse.code(), 200);
        assertEquals(true, movieResponse.isSuccessful());
    }

    @Test
    public void getMovieReviews() throws IOException {

        Call<Reviews> popularMovies = getTmdbApiClient().movieInterface().getMovieReviews(TestData.MOVIE_ID);
        Response<Reviews> reviewsResponse = popularMovies.execute();

        assertEquals(reviewsResponse.code(), 200);
        assertEquals(true, reviewsResponse.isSuccessful());
    }

    @Test
    public void getPopularVideos() throws IOException {

        Call<Videos> popularMovies = getTmdbApiClient().movieInterface().getMovieVideos(TestData.MOVIE_ID);
        Response<Videos> videosResponse = popularMovies.execute();

        assertEquals(videosResponse.code(), 200);
        assertEquals(true, videosResponse.isSuccessful());
    }
}
