truncate table usuario;
insert into usuario (nome_usuario, login_usuario, senha_usuario, cpf, celular, possui_loja) values
    ('Rafael Rocha', 'rafa@rocha', '123', 63542065561, '(11) 93214-7608', '1');

 insert  into  produto (nome_produto, preco_produto, descricao_produto, fkloja) values
 ('Café pelé', 19.2, 'Café pelé, torrado com grãos selecionados', 1);

 insert  into  produto (nome_produto, preco_produto, descricao_produto, fkloja) values
   ('Feijão', 19.2, 'Jeião de corda é ideal para almoços no fim de semana', 1);

commit;