ALTER TABLE conserto ADD ativo TINYINT NOT NULL DEFAULT 1;
UPDATE conserto SET ativo = 1 WHERE ativo IS NULL;