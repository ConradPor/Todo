package github.conpor.adapter;

import github.conpor.model.Project;
import github.conpor.model.ProjectRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SqlProjectRepository extends ProjectRepository, JpaRepository<Project, Integer> {

    @Override
    @Query("select distinct p from Project p join fetch p.steps") //Zapytanie na encjach
    List<Project> findAll();
}
