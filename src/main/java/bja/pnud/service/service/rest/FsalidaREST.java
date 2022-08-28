package bja.pnud.service.service.rest;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bja.pnud.service.service.model.Fsalida;
import bja.pnud.service.service.service.FsalidaService;

@RestController
@RequestMapping ("/api/fsalida/")
public class FsalidaREST {

    @Autowired
	private FsalidaService FsalidaService;
	
	@PostMapping
	private ResponseEntity<Fsalida> guardar (@RequestBody Fsalida fsalida){
		Fsalida temporal = FsalidaService.create(fsalida);
		
		try {
			return ResponseEntity.created(new URI("/api/fsalida"+temporal.getId())).body(temporal);
			
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	
	@GetMapping
	private ResponseEntity<List<Fsalida>> listarTodasLasFsalida (){
		return ResponseEntity.ok(FsalidaService.getAllFsalidas());
	}
	
	@DeleteMapping
	private ResponseEntity<Void> eliminarFsalida (@RequestBody Fsalida fsalida){
		FsalidaService.delete(fsalida);
		return ResponseEntity.ok().build();
	}
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteFsalida (@PathVariable ("id") Long id){
		return ResponseEntity.ok(FsalidaService.deleteById(id));
	}

	@GetMapping (value = "{id}")
	private ResponseEntity<Optional<Fsalida>> listarFsalidasPorID (@PathVariable ("id") Long id){
		return ResponseEntity.ok(FsalidaService.findById(id));
	}
	
    
}
