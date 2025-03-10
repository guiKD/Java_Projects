package br.com.fiap.ms_produto.service;

import br.com.fiap.ms_produto.dto.ProdutoRequestDTO;
import br.com.fiap.ms_produto.dto.ProdutoResponseDTO;
import br.com.fiap.ms_produto.entities.Produto;
import br.com.fiap.ms_produto.repositories.ProdutoRepository;
import br.com.fiap.ms_produto.service.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service //Definie para o Spring que é um Service
public class ProdutoService {

    // A classe de serviço depende do repositório
    //para acessar dados
    // Injeta a dependência
    @Autowired
    private ProdutoRepository repository;

    @Transactional(readOnly = true)
    public List<ProdutoResponseDTO> findAll() {
        List<Produto> list = repository.findAll();
        return list.stream().map(ProdutoResponseDTO::new).toList();

        //utilizando expressão lambda
        // return list.stream().map(x -> new ProdutoResponseDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public ProdutoResponseDTO findById(Long id) {
        Produto entity = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado. Id: " + id)
        );

        return new ProdutoResponseDTO(entity);
    }

    @Transactional
    public ProdutoResponseDTO insert(ProdutoRequestDTO requestDTO) {
        Produto entity = new Produto();
        // metodo auxiliar para converter DTO para Entity
        toEntity(requestDTO, entity);
        entity = repository.save(entity);
        return new ProdutoResponseDTO(entity);
    }

    @Transactional
    public ProdutoResponseDTO update(Long id, ProdutoRequestDTO requestDTO){
        try{
            Produto entity = repository.getReferenceById(id);
            toEntity(requestDTO, entity);
            entity = repository.save(entity);
            return new ProdutoResponseDTO(entity);
        } catch (EntityNotFoundException ex){
            throw  new ResourceNotFoundException("Recurso não encontrado. Id: " + id);
        }
    }

    //código omitido
    @Transactional
    public void delete(Long id){
        if(!repository.existsById(id)){
            throw new ResourceNotFoundException("Recurso não encontrado. Id: " + id);
        }
        repository.deleteById(id);
    }

    private void toEntity(ProdutoRequestDTO requestDTO, Produto entity) {
        entity.setNome(requestDTO.nome());
        entity.setDescricao(requestDTO.descricao());
        entity.setValor(requestDTO.valor());
    }


}
