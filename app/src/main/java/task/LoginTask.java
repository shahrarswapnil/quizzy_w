package task;

import model.UserResponse;

public interface LoginTask {
    void logIn(UserResponse userResponse);
    void onFailure(String msg);
}
