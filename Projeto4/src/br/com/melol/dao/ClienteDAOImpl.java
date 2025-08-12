package br.com.melol.dao;

import br.com.melol.domain.Cliente;
import br.com.melol.exceptions.DAOException;
import br.com.melol.exceptions.TipoChaveNaoEncontradaException;

public class ClienteDAOImpl extends ClienteDAO {
    private ClienteDAOImpl() {
    }

    public static ClienteDAOImpl createClienteDAOImpl() {
        return new ClienteDAOImpl();
    }

    @Override
    public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException, DAOException {
        return null;
    }

    @Override
    public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException, DAOException {

    }
}
