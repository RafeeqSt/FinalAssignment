package me.rafeeqstephens.repository.access;

import me.rafeeqstephens.domain.access.Login;
import me.rafeeqstephens.repository.IRepository;

import java.util.Set;

public interface LoginRepository extends IRepository<Login,String> {
    Set<Login> getAll();
}
