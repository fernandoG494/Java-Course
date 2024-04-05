package fer.webapp.models.dto;

import fer.webapp.models.User;

public class UserDto {
  private String title;
  private User user;

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
