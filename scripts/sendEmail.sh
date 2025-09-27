sudo apt-get install mailutils
 
# Trivial email body
BODY="Pipeline executada com sucesso!"
 
echo "$BODY" | mail -s "Notificação Pipeline" "$EMAIL_RECIPIENT"
 
echo "Enviado p/ $EMAIL_RECIPIENT"
