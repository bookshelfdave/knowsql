grammar KnowSQL;

prog        :  (select)+ EOF;

select: SELECT column_select
        FROM bucket=ID
        (WHERE  where_clause)?;

column_select: (SPLAT | (cols+=ID (COMMA cols+=ID)*));

where_clause: where_clause_exact | where_clause_range;

where_clause_exact: ID EQUALS where_value;

where_clause_range: ID BETWEEN where_from=where_value AND where_to=where_value;

where_value: INT | STRING | bool;

bool: TRUE | FALSE;

/*
select foo, bar, baz from mybucket where foo_bin=1;

select foo, bar, baz from mybucket where foo_int between 1 and 10;

update mybucket
    set $value="this is a test"
    where foo_int=100;
*/


SELECT      :    'select';
FROM        :    'from';
WHERE       :    'where';
BETWEEN     :    'between';
AND         :    'and';


AT          :    '@';
SPLAT       :    '*';
COMMA       :    ',';
LPAREN      :    '(';
RPAREN      :    ')';
EQUALS      :    '=';
SEMI        :    ';';
TRUE        :    'true';
FALSE       :    'false';

ID          :       [A-Za-z_]+;
INT         :       [0-9]+;

STRING  :  '"' (ESC|.)*? '"';
fragment ESC : '\\"' | '\\\\' ;

LINE_COMMENT  : '//' .*? '\r'? '\n' -> skip ;
COMMENT       : '/*' .*? '*/'       -> skip ;

WS      :       [ \t\r\n]+ -> skip;
