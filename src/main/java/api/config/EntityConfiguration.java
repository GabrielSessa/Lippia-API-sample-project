package api.config;

import services.*;

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }

    },
    RESPONSE_HEADERS {
        @Override
        public Class<?> getEntityService() {
            return ResponseHeadersService.class;
        }
    },
    CHARACTER {
        @Override
        public Class<?> getEntityService() {
            return CharacterServices.class;
        }
    },
    ALL_CHARACTER {
        @Override
        public Class<?> getEntityService() {
            return AllCharacterServices.class;
        }
    },
    EPISODE {
        @Override
        public Class<?> getEntityService() {
            return EpisodeServices.class;
        }
    },
    ALL_EPISODES {
        @Override
        public Class<?> getEntityService() {
            return AllEpisodesServices.class;
        }
    },
    ERROR {
        @Override
        public Class<?> getEntityService() {
            return ErrorServices.class;
        }
    };

    public abstract Class<?> getEntityService();
}
