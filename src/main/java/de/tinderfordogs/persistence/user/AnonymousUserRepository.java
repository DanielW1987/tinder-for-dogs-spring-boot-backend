package de.tinderfordogs.persistence.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AnonymousUserRepository extends JpaRepository<AnonymousUserEntity, Long> {

  Optional<AnonymousUserEntity> findByPublicId(String publicId);
}
