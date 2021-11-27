package com.practice.BootStrapXeroXerador;

import com.practice.Repositories.SacoRepository;
import com.practice.Repositories.XeradorRepository;
import com.practice.domain.Saco;
import com.practice.domain.Xerador;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class XeroXerador implements CommandLineRunner {



    private final XeradorRepository xeradorRepository;
    private final SacoRepository sacoRepository;

    public XeroXerador(XeradorRepository xeradorRepository, SacoRepository sacoRepository) {
        this.xeradorRepository = xeradorRepository;
        this.sacoRepository = sacoRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        System.out.println("Run initialized---------------------");

        Xerador xerador = new Xerador();
        Saco saco = new Saco();

        xerador.setLastName("Kieltyka");
        xerador.setName("Maria");
        saco.setType("branco");
        saco.setGrams(5);

        xeradorRepository.save(xerador);
        sacoRepository.save(saco);



    }

}
