package task;

import model.AnswerReview;

public interface PostReviewTask {
    void postRating(AnswerReview answerReview);
    void onFailure(String msg);
}
