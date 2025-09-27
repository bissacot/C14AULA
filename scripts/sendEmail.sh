sudo apt-get install mailutils
!/usr/bin/env bash

set -e
 
if [ -z "$EMAIL_RECIPIENT" ]; then

  echo "ERROR: EMAIL_RECIPIENT is not set."

  exit 1

fi
 
# Trivial email body
BODY="Pipeline executada com sucesso!"
 
echo "$BODY" | mail -s "Notificação Pipeline" "$NOTIFY_EMAIL"
 
echo "Enviado p/ $NOTIFY_EMAIL"

#echo "Sending mail after pipeline compl" | mail -s "Pipeline" lckbgqqkdwvsoucqyo@nespj.com
