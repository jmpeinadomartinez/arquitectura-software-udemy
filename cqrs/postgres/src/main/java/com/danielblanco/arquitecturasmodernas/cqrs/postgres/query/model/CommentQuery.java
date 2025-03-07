package com.danielblanco.arquitecturasmodernas.cqrs.postgres.query.model;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "comment", schema = "cqrs")
public class CommentQuery {

  @Id
  private Long id;
  private String content;
  @Column(name = "post_id")
  private Long postId;
  @OneToMany(mappedBy = "commentId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private List<ReactionQuery> reactions;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Long getPostId() {
    return postId;
  }

  public void setPostId(Long postId) {
    this.postId = postId;
  }

  public List<ReactionQuery> getReactions() {
    return reactions;
  }

  public void setReactions(List<ReactionQuery> reactions) {
    this.reactions = reactions;
  }
}
