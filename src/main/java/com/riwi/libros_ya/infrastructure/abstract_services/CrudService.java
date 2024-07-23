package com.riwi.libros_ya.infrastructure.abstract_services;

import org.springframework.data.domain.Page;

public interface CrudService<RQ,RS,ID> {

    RS create(RQ request);

    RS get(ID id);

    RS update(RQ request, ID id);

    void delete(ID id);

    Page<RS> getAll(int page, int size);
}
