set foreign_key_checks = 0;

truncate table  product;
truncate table  feedback;

insert into product(`id`,`name`,`price`,`details`,`currency`)
values(110, 'luxury chair', 4500,'Quise vwwsndnxnncncn','FRC'),
      (116, 'luxury chair', 4570,'Quise vwwsndnxnncncn','NGN'),
      (130, 'luxury chair', 8500,'Quise vwwsndnxnncncn','USD'),
      (115, 'luxury chair', 9500,'Quise vwwsndnxnncncn','NGN'),
        (118, 'luxury chair', 9500,'Quise vwwsndnxnncncn','FRC');


set foreign_key_checks = 1;