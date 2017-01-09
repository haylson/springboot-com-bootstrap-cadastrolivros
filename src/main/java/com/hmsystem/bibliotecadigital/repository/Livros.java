package com.hmsystem.bibliotecadigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hmsystem.bibliotecadigital.model.Livro;

public interface Livros extends JpaRepository<Livro, Long> {

}
