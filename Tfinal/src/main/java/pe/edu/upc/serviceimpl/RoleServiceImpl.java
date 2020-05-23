package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.Role;
import pe.edu.upc.repository.RoleRepository;
import pe.edu.upc.serviceinterface.RoleService;

@Service
public class RoleServiceImpl implements Serializable, RoleService {

	private static final long serialVersionUID = 1L;

	@Autowired
	private RoleRepository rR;

	@Override
	public void insert(Role role) {
		rR.save(role);
	}

	@Override
	public List<Role> list() {
		// TODO Auto-generated method stub
		return rR.findAll();
	}

}
