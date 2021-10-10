package de.tinderfordogs.service;

import de.tinderfordogs.persistence.user.AnonymousUserEntity;
import de.tinderfordogs.persistence.user.AnonymousUserRepository;
import org.springframework.stereotype.Service;

@Service
public class AnonymousUserService {

  private final AnonymousUserRepository anonymousUserRepository;

  public AnonymousUserService(AnonymousUserRepository anonymousUserRepository) {
    this.anonymousUserRepository = anonymousUserRepository;
  }

  public void createAnonymousUser(String publicId) {
    AnonymousUserEntity user = new AnonymousUserEntity(publicId);
    anonymousUserRepository.save(user);
  }
}
