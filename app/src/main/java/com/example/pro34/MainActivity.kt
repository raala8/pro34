package com.example.pro34

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


/*
import com.example.pro34.models.Movie
import com.example.pro34.models.MovieResponse
import com.example.pro34.services.MovieApiService
import com.example.pro34.services.MovieApilnterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
*/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  rv_movies.layoutManger = LinearLayoutManager(this)
       // rv_movies.setHasFixedSize(true)
       // getMovieData { movies : list<Movie> ->
         //   rv_movies.adapter = MovieAdapter(movies)
        }
    }

/*
    private fun getMovieData(callback: (list<Movie>) -> Unit){
        val apiService = MovieApiService.getInstance().create(MovieApilnterface::class.java)
        apiService.getMovieList().enqueue(object : Callback<MovieResponse> {
            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>){
             //   return callback(response.body()!!.movies)

            }
            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {

            }

        })
    }
}

 */