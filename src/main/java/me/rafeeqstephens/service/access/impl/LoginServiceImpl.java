package me.rafeeqstephens.service.access.impl;

import me.rafeeqstephens.domain.access.Login;
import me.rafeeqstephens.repository.access.LoginRepository;
import me.rafeeqstephens.repository.access.impl.LoginRepositoryImpl;
import me.rafeeqstephens.service.access.LoginService;

import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class LoginServiceImpl implements LoginService {

    private static LoginServiceImpl service = null;
    private LoginRepository repository;

    public LoginServiceImpl() {
        this.repository = LoginRepositoryImpl.getRepository();
    }

    public static LoginServiceImpl getService(){
        if(service == null) service = new LoginServiceImpl();
        return service;
    }

    @Override
    public Set<Login> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Login create(Login login) {
        return this.repository.create(login);
    }

    @Override
    public Login update(Login login) {
        return this.repository.update(login);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Login read(String s) {
        return this.repository.read(s);
    }
}
