package com.init.jocDausMongo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import java.util.Objects;
import org.springframework.data.mongodb.core.query.Update;


import com.init.jocDausMongo.dto.Secuenciador;

@Service
public class SecuenciadorService {
	private MongoOperations mongoOperations;

	@Autowired
	public SecuenciadorService(MongoOperations mongoOperations) {

		this.mongoOperations = mongoOperations;
	}

	public SecuenciadorService() {
	}

	public long generarSecuenciaPlayer(String seqName) {
		Secuenciador counter = mongoOperations.findAndModify(query(where("_id").is(seqName)),
				new Update().inc("seq", 1), options().returnNew(true).upsert(true), Secuenciador.class);
		return !Objects.isNull(counter) ? counter.getSeq() : 1;
		// return counter.getSeq();
	}

	public long generarSecuenciaTirada(String seqName) {
		Secuenciador counter = mongoOperations.findAndModify(query(where("_id").is(seqName)),
				new Update().inc("seq", 1), options().returnNew(true).upsert(true), Secuenciador.class);
		return !Objects.isNull(counter) ? (int) counter.getSeq() : 1;

	}
}
