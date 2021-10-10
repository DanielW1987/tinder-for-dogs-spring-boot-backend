package de.tinderfordogs.persistence.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "anonymous_users")
public class AnonymousUserEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private long id;

  @Column(name = "public_id")
  private String publicId;

  protected AnonymousUserEntity() {}

  public AnonymousUserEntity(String publicId) {
    this.publicId = publicId;
  }
}
