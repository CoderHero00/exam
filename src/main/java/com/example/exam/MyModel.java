package com.example.exam;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface MyModel extends PagingAndSortingRepository<Candidate, Long> {
}
