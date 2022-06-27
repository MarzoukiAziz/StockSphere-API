package com.moazmar.stocksphere.services;

import com.moazmar.stocksphere.dto.ArticleDto;
import com.moazmar.stocksphere.dto.LigneCommandeClientDto;
import com.moazmar.stocksphere.dto.LigneCommandeFournisseurDto;
import com.moazmar.stocksphere.dto.LigneVenteDto;
import java.util.List;

public interface ArticleService {

  ArticleDto save(ArticleDto dto);

  ArticleDto findById(Integer id);

  ArticleDto findByCodeArticle(String codeArticle);

  List<ArticleDto> findAll();

  List<LigneVenteDto> findHistoriqueVentes(Integer idArticle);

  List<LigneCommandeClientDto> findHistoriaueCommandeClient(Integer idArticle);

  List<LigneCommandeFournisseurDto> findHistoriqueCommandeFournisseur(Integer idArticle);

  List<ArticleDto> findAllArticleByIdCategory(Integer idCategory);

  void delete(Integer id);

}
