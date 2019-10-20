package me.rafeeqstephens.service.access;

import me.rafeeqstephens.domain.access.Login;
import me.rafeeqstephens.service.IService;

import java.util.Set;

public interface LoginService extends IService<Login,String> {
    Set<Login> getAll();
}
