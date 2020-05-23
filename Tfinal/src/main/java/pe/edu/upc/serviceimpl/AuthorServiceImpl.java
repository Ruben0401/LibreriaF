package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.Author;
import pe.edu.upc.repository.AuthorRepository;
import pe.edu.upc.serviceinterface.AuthorService;

@Service
public class AuthorServiceImpl implements Serializable, AuthorService {

	private static final long serialVersionUID = 1L;

	@Autowired
	private AuthorRepository rR;

	@Override
	public void insert(Author author) {
		rR.save(author);
	}

	@Override
	public List<Author> list() {
		// TODO Auto-generated method stub
		return rR.findAll();
	}

}
