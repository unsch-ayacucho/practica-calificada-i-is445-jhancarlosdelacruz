package pe.edu.unsch.dao;

import java.util.List;

import pe.edu.unsch.entities.CargaAcademica;

public interface CargaDao {

    List<CargaAcademica> listar();

    List<CargaAcademica> listarHora();
}
