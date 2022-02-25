<#-- columns -->
<#assign columns="t.username,t.password">
SELECT ${columns}
  FROM t_user t
 WHERE 1 = 1
<#if form.id??>
   AND id = <@p name="form.id"/>
</#if>
<#if form.username?has_content>
   AND username = <@p name="form.username"/>
</#if>
<#--
select ${columns} from names where id in (${ids?join(',')})
-->