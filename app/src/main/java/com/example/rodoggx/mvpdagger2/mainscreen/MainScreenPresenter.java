package com.example.rodoggx.mvpdagger2.mainscreen;

import com.example.rodoggx.mvpdagger2.data.Post;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Retrofit;
import retrofit2.http.GET;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by RodoggX on 8/6/2017.
 */

public class MainScreenPresenter implements MainScreenContract.Presenter {

    public Retrofit retrofit;
    MainScreenContract.View mView;

    @Inject
    public MainScreenPresenter(Retrofit retrofit, MainScreenContract.View mView) {
        this.retrofit = retrofit;
        this.mView = mView;
    }

    @Override
    public void loadPost() {
        retrofit.create(PostService.class).getPostList().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.io())
                .subscribe(new Observer<List<Post>>() {
                    @Override
                    public void onCompleted() {
                        mView.showComplete();
                    }

                    @Override
                    public void onError(Throwable e) {
                        mView.showError(e.getMessage());
                    }

                    @Override
                    public void onNext(List<Post> posts) {
                        mView.showPosts(posts);
                    }
                });
    }

    public interface PostService {
        @GET("/posts")
        Observable<List<Post>> getPostList();
    }
}
