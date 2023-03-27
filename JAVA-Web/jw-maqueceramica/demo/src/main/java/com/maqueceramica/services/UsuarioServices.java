package com.maqueceramica.services;
	
	import java.util.ArrayList;
	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.maqueceramica.models.UsuarioModel;
	import com.maqueceramica.repositories.UsuarioRepository;

	@Service
	public class UsuarioServices {
		@Autowired
		UsuarioRepository usuariorepositorio;

		public boolean eliminarUsuario(Long id) {
			try {
				usuariorepositorio.deleteById(id);
				return true;
			} catch (Exception e) {
				return false;
			}
		}


		public ArrayList<UsuarioModel> ListarUsuarios() {
			return (ArrayList<UsuarioModel>) usuariorepositorio.findAll();
		}

		public UsuarioModel guardarUsuario(UsuarioModel usuario) {
			return usuariorepositorio.save(usuario);
		}

		public Optional<UsuarioModel> obtenerPorId(Long id) {
			return usuariorepositorio.findById(id);
		}
	}

