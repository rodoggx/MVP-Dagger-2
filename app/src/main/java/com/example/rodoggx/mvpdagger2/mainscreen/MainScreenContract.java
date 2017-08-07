package com.example.rodoggx.mvpdagger2.mainscreen;

import com.example.rodoggx.mvpdagger2.data.Post;

import java.util.List;

/**
 * Created by RodoggX on 8/6/2017.
 */

public class MainScreenContract {
    interface View {
        void showPosts(List<Post> posts);

        void showError(String message);

        void showComplete();
    }

    interface Presenter {
        void loadPost();
    }
}
