package me.dio.academia.digital.entity.form;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class AlunoUpdateForm {

  private String nome1;

  private String bairro;

  private LocalDate dataDeNascimento;
}
