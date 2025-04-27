package com.example.demo.post.repository;

import com.example.demo.post.entity.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostRepositoryImpl implements PostRepository{
    private final SpringDataJpaPostRepository repository;

    @Override
    @Transactional
    public Post save(Post post) {
        return repository.save(post);
    }

    @Override
    public Optional<Post> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Post> findAll() {
        return repository.findAll();
    }
}
