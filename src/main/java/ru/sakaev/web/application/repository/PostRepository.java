package ru.sakaev.web.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sakaev.web.application.entity.Post;
import ru.sakaev.web.application.entity.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAllByUserOrderByCreateDateDesc(User user);

    List<Post> findAllByOrderByCreateDateDesc();

    Optional<Post> findPostByIdAndUser(Long id, User user);
}
