# PIE (Project Iseng Enak)
for example only

Quickstart :

- Download and install java 1.8 or 10
- Download Solr v6 or earlier (http://archive.apache.org/dist/lucene/solr/6.2.0/solr-6.2.0.tgz)
- Extract
- Run SolrCloud example : cd $SolrHome && bin/solr start -e cloud -noprompt (default 2 Nodes port 8983,7574)
- Run PIE : cd $PIEHome && mvn spring-boot:run
- Open localhost:8080/getall or you can change port on application.properties : server.port=(PortNumber)