<template>

    <v-card outlined>
        <v-card-title>
            UpdateSupportTicket
        </v-card-title>

        <v-card-text>
            <String label="TicketId" v-model="value.ticketId" :editMode="editMode"/>
            <String label="TicketSeverity" v-model="value.ticketSeverity" :editMode="editMode"/>
            <String label="TicketDescription" v-model="value.ticketDescription" :editMode="editMode"/>
            <String label="TicketStatus" v-model="value.ticketStatus" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="updateSupportTicket"
            >
                UpdateSupportTicket
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'UpdateSupportTicketCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.ticketId = '';
            this.value.ticketSeverity = '';
            this.value.ticketDescription = '';
            this.value.ticketStatus = '';
        },
        watch: {
        },
        methods: {
            updateSupportTicket() {
                this.$emit('updateSupportTicket', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

